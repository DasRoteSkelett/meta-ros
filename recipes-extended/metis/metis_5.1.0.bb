DESCRIPTION = " METIS is a set of serial programs for partitioning graphs, partitioning finite element meshes, and producing fill reducing orderings for sparse matrices. The algorithms implemented in METIS are based on the multilevel recursive-bisection, multilevel k-way, and multi-constraint partitioning schemes developed in our lab. "

LICENSE="Apache-2.0"

LIC_FILES_CHKSUM="file://LICENSE.txt;md5=b46727c71b60d35ad5d2f927c4a3929b"

SRC_URI="http://glaros.dtc.umn.edu/gkhome/fetch/sw/metis/metis-5.1.0.tar.gz \
	 file://0001-CMake-add-version-soversion-to-library.patch \
	 "

SRC_URI[md5sum] = "5465e67079419a69e0116de24fce58fe"
SRC_URI[sha256sum] = "76faebe03f6c963127dbb73c13eab58c9a3faeae48779f049066a21c087c5db2"

EXTRA_OECMAKE +=" -DSHARED=1 -DGKLIB_PATH=${S}/GKlib -DOPENMP=1 -DMETIS_VERSION=${PV} "

inherit cmake
