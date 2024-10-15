job('NestJS example') {
    scm {
        git('https://github.com/yh0921k/jenkins-cicd.git') {  node ->
            node / gitConfigName('yh0921k')
            node / gitConfigEmail('yh0921k@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }
}
