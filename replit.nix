{ pkgs }: {
    deps = [
        pkgs.run TestTV.java
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}