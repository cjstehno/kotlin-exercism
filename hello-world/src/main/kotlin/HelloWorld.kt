fun hello(name: String = "") = "Hello, ${if (name.trim() != "") name else "World"}!"
