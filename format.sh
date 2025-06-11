####!/bin/sh
####find src -name "*.java" -print0 | xargs -0 -n 500 java -jar google-java-format-1.23.0-all-deps.jar --replace


echo "🔧 Formatting Java files with google-java-format..."

# Exit if formatting tool is missing
FORMATTER_JAR="google-java-format-1.23.0-all-deps.jar"
if [ ! -f "$FORMATTER_JAR" ]; then
  echo "❌ Formatter jar not found: $FORMATTER_JAR"
  echo "📥 Please download it from https://github.com/google/google-java-format"
  exit 1
fi

# Find all .java files and format them in-place
find src -name "*.java" -print0 | xargs -0 -n 500 java -jar "$FORMATTER_JAR" --replace

echo "✅ Formatting complete."