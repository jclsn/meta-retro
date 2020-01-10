LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit libretro

SRCREV = "${AUTOREV}"
SRC_URI = "gitsm://github.com/libretro/vba-next.git;protocol=https"
S = "${WORKDIR}/git"

LIBRETRO_CORE = "vba_next"
LIBRETRO_PLATFORM = "unix"