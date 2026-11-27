# Linux Simulator

The current SiFli SDK PC simulator documented for SF32LB52x is the Windows `pc_hcpu` target and produces `main.exe` using the SDK's MSVC setup. The SDK does not document an equivalent native Linux `pc_hcpu` target.

A native Linux simulator cannot be honestly provided by simply wrapping the firmware build: it requires a Linux host port of the SiFli RT-Thread / display / input simulator backend. This directory is reserved for that port; no nonfunctional launcher is provided.
