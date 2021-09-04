# InstallerFileFormat
A Installer System Similar To GIT

# Usage
### Downloading
```
java -f:<link to valid iff file>
java -jar iff.jar -f:https://github.com/ChefZander/repo/raw/main/example.iff
```
If the URL is not valid, it will throw an error.

### The IFF Format
The IIF Format is very simple.
```
<filename>=<url to file to download>;
```
You can put multiple file declarations on one line:
```
a=https://example.com/a.txt;c=https://example.com/b.txt;
```
filename: The Name of the file that will later be saved on disk <br>
url to file to download: URL to file. The contents of this file will be copied byte-by-byte into the filename file <br> 
After the url put a ; to end the command. This is required to make multiple files per line possible.<br>

# License
You can use this program for free, always.
If you want to edit the code, or distribute your own modded version then:
- It has to be open source (you need to share your code)
- Credit Me (include a link to this repo)
- It has to be free (you cannot sell the source-code or builds)
