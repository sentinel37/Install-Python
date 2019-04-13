if (fileExists('requirements/preinstall.txt')) {
    sh """
    . .env/bin/activate
    pip install -r requirements/preinstall.txt
    """
}
...
sh """
. .env/bin/activate
pip install -r requirements/test.txt
"""
}
stage("Unittests") {
    sh """
    . .env/bin/activate
    ./hello.py test --noinput
    """
}