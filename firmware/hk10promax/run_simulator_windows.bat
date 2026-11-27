@echo off
setlocal

if not defined SIFLI_SDK (
    if "%~1"=="" (
        echo Set SIFLI_SDK or pass the SiFli-SDK directory as the first argument.
        exit /b 2
    )
    set "SIFLI_SDK=%~1"
)

if not exist "%SIFLI_SDK%\set_env.bat" (
    echo SiFli SDK set_env.bat was not found under "%SIFLI_SDK%".
    exit /b 2
)

where cl.exe >nul 2>nul
if errorlevel 1 (
    echo Run this script from an x64 Native Tools Command Prompt for Visual Studio.
    exit /b 2
)

call "%SIFLI_SDK%\set_env.bat" gcc
if errorlevel 1 exit /b %errorlevel%

pushd "%~dp0project"
if errorlevel 1 exit /b 2

scons --board=pc_hcpu -j%NUMBER_OF_PROCESSORS%
if errorlevel 1 (
    popd
    exit /b 1
)

if not exist "build_pc_hcpu\main.exe" (
    echo Simulator executable was not generated.
    popd
    exit /b 1
)

start "" "build_pc_hcpu\main.exe"
popd
