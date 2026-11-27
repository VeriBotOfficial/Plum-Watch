@echo off
setlocal

set "SIMULATOR_SCRIPT=%~dp0run_simulator_windows.ps1"

if not exist "%SIMULATOR_SCRIPT%" (
    echo Simulator PowerShell launcher was not found:
    echo "%SIMULATOR_SCRIPT%"
    exit /b 2
)

if "%~1"=="" (
    powershell.exe -NoLogo -NoProfile -ExecutionPolicy Bypass -File "%SIMULATOR_SCRIPT%"
) else (
    powershell.exe -NoLogo -NoProfile -ExecutionPolicy Bypass -File "%SIMULATOR_SCRIPT%" -SdkPath "%~1"
)

exit /b %errorlevel%
