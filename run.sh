#!/bin/bash
# shell script for running java code 

# Get the name of the current directory 
CURRENT_DIR_NAME=$(basename "$PWD")

# Check for the existence of Program.java in the current directory
if [ ! -f "Program.java" ]; then
  echo "Error: Program.java not found in the current directory ($CURRENT_DIR_NAME)."
  exit 1
fi

# Compile all Java files in the current directory
javac *.java

# Check if compilation was successful
if [ $? -ne 0 ]; then
  echo "Compilation failed for $CURRENT_DIR_NAME."
  exit 1
fi

# Run the main program
java Program


# clean compiled files after execution
rm -f *.class