$ErrorActionPreference = "Stop"

$ScriptDir = $PSScriptRoot
$RepositoryRoot = (Resolve-Path (Join-Path $ScriptDir "..\..")).Path
$AndroidProject = Join-Path $RepositoryRoot "app\android"
$OutputDirectory = Join-Path $ScriptDir "build"
$OutputApk = Join-Path $OutputDirectory "plum-watch-simulator.apk"

if (-not (Get-Command java -ErrorAction SilentlyContinue)) {
    throw "Java is required. Install JDK 17 or newer and try again."
}

$GradleWrapper = Join-Path $AndroidProject "gradlew.bat"
if (-not (Test-Path -LiteralPath $GradleWrapper)) {
    throw "Android Gradle project was not found at: $AndroidProject"
}

Push-Location $AndroidProject
try {
    Write-Host "[Plum Watch] Running Android unit tests and building the debug APK..."
    & $GradleWrapper --no-daemon assembleDebug
    if ($LASTEXITCODE -ne 0) {
        throw "Gradle failed with exit code $LASTEXITCODE."
    }
}
finally {
    Pop-Location
}

$BuiltApk = Join-Path $AndroidProject "app\build\outputs\apk\debug\app-debug.apk"
if (-not (Test-Path -LiteralPath $BuiltApk -PathType Leaf)) {
    throw "Gradle finished without producing the expected APK: $BuiltApk"
}

New-Item -ItemType Directory -Force -Path $OutputDirectory | Out-Null
Copy-Item -LiteralPath $BuiltApk -Destination $OutputApk -Force
$Hash = (Get-FileHash -LiteralPath $OutputApk -Algorithm SHA256).Hash.ToLowerInvariant()
Write-Host "SHA-256: $Hash"
Write-Host "APK: $OutputApk"
