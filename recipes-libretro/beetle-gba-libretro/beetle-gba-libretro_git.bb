LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit libretro

SRCREV = "${AUTOREV}"
SRC_URI = "gitsm://github.com/libretro/beetle-gba-libretro.git;protocol=https"
S = "${WORKDIR}/git"

LIBRETRO_CORE = "mednafen_gba"
LIBRETRO_PLATFORM = "unix"
LIBRETRO_PLATFORM_AUTODETECT_RPI1 = "unix"