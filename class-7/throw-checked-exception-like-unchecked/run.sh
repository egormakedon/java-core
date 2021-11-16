# Expected: checked exception thrown like unchecked.
mkdir -p target
javac -sourcepath src -d target src/*.java
java -classpath target Main