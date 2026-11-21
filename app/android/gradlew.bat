@echo off
setlocal

set "PLUM_GRADLE_VERSION=9.3.1"
set "PLUM_GRADLE_SHA256=b266d5ff6b90eada6dc3b20cb090e3731302e553a27c5d3e4df1f0d76beaff06"
if not defined GRADLE_USER_HOME set "GRADLE_USER_HOME=%USERPROFILE%\.gradle"
set "PLUM_GRADLE_BASE=%GRADLE_USER_HOME%\plum-bootstrap"
set "PLUM_GRADLE_HOME=%PLUM_GRADLE_BASE%\gradle-%PLUM_GRADLE_VERSION%"

if not exist "%PLUM_GRADLE_HOME%\bin\gradle.bat" (
    if not exist "%PLUM_GRADLE_BASE%" mkdir "%PLUM_GRADLE_BASE%"
    powershell -NoProfile -ExecutionPolicy Bypass -Command "$ErrorActionPreference='Stop'; $base='%PLUM_GRADLE_BASE%'; $version='%PLUM_GRADLE_VERSION%'; $expected='%PLUM_GRADLE_SHA256%'; $zip=Join-Path $base ('gradle-'+$version+'-bin.zip'); $ProgressPreference='SilentlyContinue'; Invoke-WebRequest -Uri ('https://downloads.gradle.org/distributions/gradle-'+$version+'-bin.zip') -OutFile $zip; $actual=(Get-FileHash -LiteralPath $zip -Algorithm SHA256).Hash.ToLowerInvariant(); if ($actual -ne $expected) { Remove-Item -LiteralPath $zip -Force; throw 'Gradle distribution SHA-256 mismatch.' }; Expand-Archive -LiteralPath $zip -DestinationPath $base -Force; Remove-Item -LiteralPath $zip"
    if errorlevel 1 exit /b 1
)

call "%PLUM_GRADLE_HOME%\bin\gradle.bat" -p "%~dp0." %*
set "PLUM_EXIT=%ERRORLEVEL%"
endlocal & exit /b %PLUM_EXIT%
