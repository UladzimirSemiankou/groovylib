enum Level {DEBUG, INFO}

def call() {
  println env.LogLevel
}

def debug(message) {
  if (env.LogLevel <= Level.DEBUG) {
    println env.LogLevel
    println "[DEBUG]: ${message}"
  }
}

def info(message) {
  if (env.LogLevel <= Level.INFO) {
    println "[INFO]: ${message}"
  }
}
