LICENSE = "MAME"
LIC_FILES_CHKSUM = "file://README.md;md5=a9c48e15fed578c670fd8e2d8d601b05"

inherit libretro-git

LIBRETRO_CORE = "mame2010"
LIBRETRO_REPO = "github.com/libretro/${BPN}.git"

LIBRETRO_PLATFORM_AUTODETECT_RPI4 = "${LIBRETRO_PLATFORM_AUTODETECT_RPI3}"
