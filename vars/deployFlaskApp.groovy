// vars/deployFlaskApp.groovy

def call(Map pipelineParams) {
    def VENV_DIR = pipelineParams.VENV_DIR ?: 'venv'
    def deployScript = """
        . ${VENV_DIR}/bin/activate
        nohup gunicorn --bind 0.0.0.0:5000 wsgi:app &
        sleep 60
    """
    sh deployScript
}
