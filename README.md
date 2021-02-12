# ms-sqlserver-jdbc-tester

A simple Spring Boot command line app to test JDBC connection to SQL Server database.

## How to run

Download the JAR from [release](https://github.com/aimtiaz11/ms-sqlserver-jdbc-tester/releases/tag/1.0) page or alternatively checkout the code from this repository and run:

```
mvn clean package
```

Execute the JAR file. Example below:

```
java -jar target/ms-sqlserver-jdbc-1.0.jar "jdbc:sqlserver://mydatabase.db.windows.net:1433;database=My_Example_DB;user=user@example.com;password=secret123;encrypt=true;trustServerCertificate=true;loginTimeout=90;authentication=ActiveDirectoryPassword"
```

To test the JDBC connection the app will attempt to connect to SQL Server and execute a single SQL query: `SELECT SUSER_SNAME()` and close connection.


## License
(The MIT License)

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
