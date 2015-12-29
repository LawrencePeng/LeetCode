for md in `find . -iname '*.md'`
do
    mv "$md" "$md.java"
done
