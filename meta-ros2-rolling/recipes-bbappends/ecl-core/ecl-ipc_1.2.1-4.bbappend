# Copyright (c) 2024 Wind River Systems, Inc.

# ERROR: QA Issue: non -dev/-dbg/nativesdk- package ecl-ipc contains symlink .so '/usr/lib/libecl_ipc.so' [dev-so]
FILES:${PN}-dev += " \
    ${libdir}/libecl_ipc.so \
"

# not copyrighted stuff
# Setting License from BSD to BSD-3-Clause to be SPDX compliant
LICENSE = "BSD-3-Clause"
