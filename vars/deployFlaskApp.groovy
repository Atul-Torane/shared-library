// vars/deployFlaskApp.groovy

def call(Map pipelineParams) {
    def VENV_DIR = pipelineParams.VENV_DIR ?: 'venv'
    def deployScript = """
        python3 -m venv ${VENV_DIR}
        source ${VENV_DIR}/bin/activate
    """
    sh deployScript
}
