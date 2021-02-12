# ms-sqlserver-jdbc-tester

A simple Spring Boot command line app to test JDBC connection to SQL Server database.

## How to run

Download the JAR from release page or alternatively download the code and build the jar file:

```
mvn clean package
```

Execute the JAR file. Example below:

```
java -jar target/ms-sqlserver-jdbc-1.0.jar ""jdbc:sqlserver://mydatabase.db.windows.net:1433;database=example@user.com;user=myser@example.com;password=secret123;encrypt=true;trustServerCertificate=true;loginTimeout=90;authentication=ActiveDirectoryPassword"
```


## License
(The MIT License)

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.