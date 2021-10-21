# Expected: compiled and disassembled successfully.
mkdir -p target
javac -d target Main.java
javap target/Main.class >> target/disassemble-out-without-keys.txt
javap -c target/Main.class >> target/disassemble-out-with--c.txt
java -classpath target Main