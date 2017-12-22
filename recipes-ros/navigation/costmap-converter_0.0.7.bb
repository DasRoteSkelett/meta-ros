DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cells to primitive types."
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roscpp geometry-msgs std-msgs costmap-2d dynamic-reconfigure pluginlib cv-bridge"

SRC_URI = "https://github.com/rst-tu-dortmund/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "44b85c84d8017937bac41c4e98bf4610"
SRC_URI[sha256sum] = "a6b4fb6db4457fff87df87785cedc7aaa99a2f834632b1c707b39a31a3654cd6"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
