#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null 2>&1 && pwd )"
cd "$DIR"

MVN_BIN="/Applications/Apache NetBeans.app/Contents/Resources/netbeans/java/maven/bin/mvn"
if [ ! -f "$MVN_BIN" ]; then
    MVN_BIN="mvn"
fi

echo "Iniciando Asisten HelpDesk..."
"$MVN_BIN" compile exec:java
