DESCRIPTION = "Libretro PC cores"

inherit retro/packagegroup

LIBRETRO_PC_CORES ?= " \
  bk-libretro \
  bluemsx-libretro \
  dosbox-libretro \
  fmsx-libretro \
  quasi88-libretro \
  vice-libretro \
"

LIBRETRO_PC_CORES_remove_arm64 = "dosbox-libretro"

RRECOMMENDS_${PN} = "${LIBRETRO_PC_CORES}"