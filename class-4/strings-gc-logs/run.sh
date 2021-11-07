# Expected: gc-logs created.
mkdir -p target
javac -d target Main.java
java -classpath target -Xloggc:target/gc-logs.log Main