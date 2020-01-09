SUMMARY = "RetroArch system user"
DESCRIPTION = "Dedicated RetroArch system user"

PR = "r7"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

RETROARCH_USER_ID ??= "1000"
RETROARCH_USER_GROUPS ??= "video,audio,users,tty,root,dialout,input"

inherit useradd

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--create-home --user-group -G ${RETROARCH_USER_GROUPS} -u ${RETROARCH_USER_ID} -d /home/retroarch -s /bin/bash retroarch"

ALLOW_EMPTY_${PN} = "1"
EXCLUDE_FROM_WORLD = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
