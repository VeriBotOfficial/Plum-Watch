param(
    [string]$SdkPath = $env:SIFLI_SDK,
    [int]$Jobs = [Environment]::ProcessorCount,
    [switch]$AddDisk
)

$ErrorActionPreference = "Stop"
$env:SIFLI_SDK_SHELL = "pwsh.exe"
$FirmwareRoot = (Resolve-Path $PSScriptRoot).Path
$ProjectDir = Join-Path $FirmwareRoot "project"

if (-not $SdkPath) {
    throw "Set SIFLI_SDK or pass -SdkPath with your SiFli-SDK directory."
}

$SdkPath = (Resolve-Path $SdkPath).Path
$ExportScript = Join-Path $SdkPath "export.ps1"
if (-not (Test-Path $ExportScript)) {
    throw "SiFli SDK export.ps1 was not found at: $ExportScript"
}

Push-Location $SdkPath
try {
    & $ExportScript
    if ($LASTEXITCODE -and $LASTEXITCODE -ne 0) {
        throw "SiFli SDK environment setup failed with exit code $LASTEXITCODE."
    }
}
finally {
    Pop-Location
}

if (-not $env:SIFLI_SDK) {
    $env:SIFLI_SDK = $SdkPath
}

if (-not (Get-Command scons -ErrorAction SilentlyContinue)) {
    throw "SCons is unavailable. Check the SiFli SDK environment setup."
}

Push-Location $ProjectDir
try {
    $Arguments = @("--board=eh-lb525", "-j$([Math]::Max(1, $Jobs))")
    if ($AddDisk) {
        $Arguments += "--add-disk"
    }
    & scons @Arguments
    if ($LASTEXITCODE -ne 0) {
        throw "Firmware build failed with exit code $LASTEXITCODE."
    }
}
finally {
    Pop-Location
}
