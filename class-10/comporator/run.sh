# Expected: used comporator to sort persons by name and age.
mkdir -p target
javac -sourcepath src -d target src/*.java
java -classpath target Main