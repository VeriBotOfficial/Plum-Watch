param(
    [string]$SdkPath,
    [int]$Jobs = [Environment]::ProcessorCount
)

$ErrorActionPreference = "Stop"
$FirmwareRoot = $PSScriptRoot
$RepositoryRoot = Split-Path -Parent (Split-Path -Parent $FirmwareRoot)
$ProjectDir = Join-Path $FirmwareRoot "project"
$SimulatorDrive = $null

function Find-SiFliSdk {
    param([string]$RequestedPath)

    $candidates = @()
    if ($RequestedPath) { $candidates += $RequestedPath }
    if ($env:SIFLI_SDK) { $candidates += $env:SIFLI_SDK }
    if ($env:SIFLI_SDK_PATH) { $candidates += $env:SIFLI_SDK_PATH }

    foreach ($drive in Get-PSDrive -PSProvider FileSystem) {
        foreach ($relative in @(
            "SiFLi\SiFLi-SDK",
            "SiFli\SiFli-SDK",
            "OpenSiFli\SiFli-SDK",
            "SiFli-SDK"
        )) {
            $candidates += Join-Path $drive.Root $relative
        }
    }

    foreach ($candidate in ($candidates | Select-Object -Unique)) {
        if (-not $candidate) { continue }
        if (Test-Path -LiteralPath $candidate -PathType Container) {
            $resolved = (Resolve-Path -LiteralPath $candidate).Path
            if (Test-Path -LiteralPath (Join-Path $resolved "export.ps1")) {
                return $resolved
            }
            if (Test-Path -LiteralPath (Join-Path $resolved "set_env.bat")) {
                return $resolved
            }
        }
    }

    throw "SiFli SDK was not found. Pass its folder once, or set the SIFLI_SDK user environment variable."
}

function Import-VisualStudioEnvironment {
    if (Get-Command cl.exe -ErrorAction SilentlyContinue) { return }

    $programFilesX86 = [Environment]::GetFolderPath("ProgramFilesX86")
    $vswhere = Join-Path $programFilesX86 "Microsoft Visual Studio\Installer\vswhere.exe"
    if (-not (Test-Path -LiteralPath $vswhere)) {
        throw "MSVC was not found. Install the Visual Studio C++ build tools, or open an x64 Native Tools PowerShell prompt."
    }

    $vsInstall = & $vswhere -latest -products "*" -requires Microsoft.VisualStudio.Component.VC.Tools.x86.x64 -property installationPath
    if (-not $vsInstall) {
        throw "Visual Studio C++ build tools were not found. Install the Desktop development with C++ workload."
    }

    $vsDevCmd = Join-Path $vsInstall "Common7\Tools\VsDevCmd.bat"
    if (-not (Test-Path -LiteralPath $vsDevCmd)) {
        throw "Visual Studio environment setup script was not found: $vsDevCmd"
    }

    $command = 'call "' + $vsDevCmd + '" -arch=x64 -host_arch=x64 >nul && set'
    $environment = & $env:ComSpec /d /s /c $command
    foreach ($line in $environment) {
        $separator = $line.IndexOf("=")
        if ($separator -gt 0) {
            $name = $line.Substring(0, $separator)
            $value = $line.Substring($separator + 1)
            [Environment]::SetEnvironmentVariable($name, $value, "Process")
        }
    }

    if (-not (Get-Command cl.exe -ErrorAction SilentlyContinue)) {
        throw "Visual Studio was located, but cl.exe could not be activated."
    }
}

try {
    $SdkRoot = Find-SiFliSdk -RequestedPath $SdkPath
    $env:SIFLI_SDK = $SdkRoot

    $ExportScript = Join-Path $SdkRoot "export.ps1"
    if (Test-Path -LiteralPath $ExportScript) {
        Write-Host "[SiFli] Activating SDK environment..."
        Push-Location $SdkRoot
        try {
            & $ExportScript -t gcc
            if ($LASTEXITCODE -and $LASTEXITCODE -ne 0) {
                throw "SiFli SDK environment activation failed with exit code $LASTEXITCODE."
            }
        }
        finally {
            Pop-Location
        }
    }
    else {
        $SetEnv = Join-Path $SdkRoot "set_env.bat"
        if (-not (Test-Path -LiteralPath $SetEnv)) {
            throw "Neither export.ps1 nor set_env.bat exists in $SdkRoot."
        }

        $command = 'call "' + $SetEnv + '" gcc >nul && set'
        $environment = & $env:ComSpec /d /s /c $command
        foreach ($line in $environment) {
            $separator = $line.IndexOf("=")
            if ($separator -gt 0) {
                $name = $line.Substring(0, $separator)
                $value = $line.Substring($separator + 1)
                [Environment]::SetEnvironmentVariable($name, $value, "Process")
            }
        }
        $env:SIFLI_SDK = $SdkRoot
    }

    Import-VisualStudioEnvironment

    if (-not (Get-Command scons -ErrorAction SilentlyContinue)) {
        throw "SCons is unavailable after activating the SiFli SDK environment."
    }

    # The SDK image converter does not consistently quote source paths. Use a
    # temporary drive alias so repositories under paths containing spaces build.
    $usedDrives = (Get-PSDrive -PSProvider FileSystem).Name
    $BuildRoot = $null
    foreach ($letter in @("Z","Y","X","W","V","U","T","S","R","Q","P")) {
        if ($usedDrives -contains $letter) { continue }
        $driveName = $letter + ":"
        & subst $driveName $RepositoryRoot
        if ($LASTEXITCODE -eq 0) {
            $SimulatorDrive = $driveName
            $BuildRoot = $letter + ":"
            break
        }
    }
    if (-not $BuildRoot) {
        throw "Could not allocate a temporary drive for the simulator build."
    }
    $ProjectDir = Join-Path $BuildRoot "firmware\hk10promax\project"

    Push-Location $ProjectDir
    try {
        $jobCount = [Math]::Max(1, $Jobs)
        Write-Host "[SiFli] Building PC simulator (pc_hcpu)..."
        & scons --board=pc_hcpu "-j$jobCount"
        if ($LASTEXITCODE -ne 0) {
            throw "Simulator build failed with exit code $LASTEXITCODE."
        }
    }
    finally {
        Pop-Location
    }

    $Simulator = Join-Path $ProjectDir "build_pc_hcpu\main.exe"
    if (-not (Test-Path -LiteralPath $Simulator)) {
        throw "Build completed, but the simulator executable was not found at $Simulator."
    }

    Write-Host "[SiFli] Launching simulator..."
    Start-Process -FilePath $Simulator -WorkingDirectory (Split-Path $Simulator) -Wait
}
catch {
    Write-Host "[Simulator] $($_.Exception.Message)" -ForegroundColor Red
    exit 1
}
finally {
    if ($SimulatorDrive) {
        & subst $SimulatorDrive /d
    }
}
