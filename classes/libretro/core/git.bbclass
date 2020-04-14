inherit libretro/core retro/git

LIBRETRO_GIT_PROTOCOL ?= "https"
LIBRETRO_GIT_BRANCH ?= "master"
LIBRETRO_GIT_FETCHER ?= "gitsm://"
LIBRETRO_GIT_REV ??= "${AUTOREV}"
LIBRETRO_CORE_PATCHES ??= ""

S = "${WORKDIR}/git"
SRC_URI = "${LIBRETRO_GIT_FETCHER}${LIBRETRO_GIT_REPO};protocol=${LIBRETRO_GIT_PROTOCOL};branch=${LIBRETRO_GIT_BRANCH} ${LIBRETRO_CORE_PATCHES}"
SRCREV ?= "${@bb.utils.contains('DISTRO_FEATURES', 'libretro-latest', '${AUTOREV}', '${LIBRETRO_GIT_REV}', d)}"

require tested-revs.inc
