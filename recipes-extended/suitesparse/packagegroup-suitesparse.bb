DESCRIPTION = "SuiteSparse Packages"

inherit packagegroup meta

RDEPENDS_${PN} = "\
	       suitesparse-amd \
	       suitesparse-btf \
	       suitesparse-camd \
	       suitesparse-ccolamd \
	       suitesparse-cholmod \
	       suitesparse-colamd \
	       suitesparse-cxsparse \
	       suitesparse-klu \
	       suitesparse-ldl \
	       suitesparse-spqr	\
	       suitesparse-umfpack \
"