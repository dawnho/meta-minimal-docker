LICENSE="CLOSED"

FILESEXTRAPATHS_prepend := "${THISDIR}:${THISDIR}/docker-kernel:"

SRC_URI += "file://ebtables.scc \
            file://lxc.scc \
            file://docker.scc \
           "

KERNEL_MODULE_AUTOLOAD += "xt_conntrack"
KERNEL_MODULE_AUTOLOAD += "xt_addrtype"
