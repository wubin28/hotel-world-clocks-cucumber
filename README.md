# The sample project of cucumber-java and cucumber-junit 1.1.2

Use Cucumber and Java to implement the Hotel World Clocks kata and refactor it to Observer design pattern. In this kata, a hotel has 5 clocks showing the time of Beijing (UTC+8), London (UTC+0), Moscow (UTC+4), Sydney (UTC+10), and New York (UTC-5). You have to consider daylight saving time (DST) for cities like London and New York in this kata. When the time of each one of these clocks is set due to incorrect time or start/end of daylight saving period, the time of all other clocks will be set automatically. The hotel would add more clocks for different cities in the future.

# Feature: Kata Hotel World Clocks
  In order to adjust the time of clocks of different cities in the lobby of a hotel as easily as possible,
  As a employee of the hotel,
  I want to adjust the time of any one clock and the time of all other clocks will be adjusted automatically.

# Steps
1. Create a folder called `resources` under `src/test`
2. Write a feature file called `hotel_world_clocks.feature` under folder `resources/com/wubinben/katas/bdd/cucumber`
3. Update `pom.xml` with the following
```
    <build>
        <plugins>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>2.5.1</version>
            <configuration>
              <encoding>UTF-8</encoding>
              <source>1.8</source>
              <target>1.8</target>
            </configuration>
          </plugin>

        </plugins>
    </build>

    <dependencies>
        <dependency>
          <groupId>info.cukes</groupId>
          <artifactId>cucumber-java</artifactId>
          <version>1.1.2</version>
          <scope>test</scope>
        </dependency>
        <dependency>
          <groupId>info.cukes</groupId>
          <artifactId>cucumber-junit</artifactId>
          <version>1.1.2</version>
          <scope>test</scope>
        </dependency>
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>4.12</version>
          <scope>test</scope>
        </dependency>
    </dependencies>
    <properties>
        <file.encoding>UTF-8</file.encoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
```
4. Add `RunCukesTest` class under the `test/java` folder with the following contents
```
           @RunWith(Cucumber.class)
           @Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"})
           public class RunCukesTest {
           }
```
5. run `mvn clean test`
6. Add `HotelWorldClocksStepdefs` class under the `test/java` folder and copy and paste the "missing steps" generated in the output of `mvn clean test`.
7. Make the tests green
8. Check the report `target/cucumber-html-report`
