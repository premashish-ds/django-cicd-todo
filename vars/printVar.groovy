def call(String var_email) {
    echo "var_email: ${var_email}"
    echo "Current login user: ${env.USER}"
    echo "Current job name: ${env.JOB_NAME}"
}
