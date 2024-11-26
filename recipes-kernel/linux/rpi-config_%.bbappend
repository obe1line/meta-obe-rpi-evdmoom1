# add jac01 overlay to the config file

do_deploy:append() {
        echo "dtoverlay=jac01" >> "${DEPLOYDIR}/bootfiles/config.txt"
}