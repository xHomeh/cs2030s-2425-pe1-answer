#!/bin/bash
for i in *.java; do
  if [ -w $i ]; then
    ~cs2030s/bin/google-java-format --skip-javadoc-formatting --skip-removing-unused-imports -replace "$i"
  fi
done
if [ -d cs2030s/fp ]; then
  for i in cs2030s/fp/*.java; do
    ~cs2030s/bin/google-java-format --skip-javadoc-formatting --skip-removing-unused-imports -replace "$i"
  done
fi
