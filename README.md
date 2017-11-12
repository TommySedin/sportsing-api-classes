# sportsing-api-classes

Klona ner detta repo och kör "mvn install" i katalogen för att peta in i ditt lokala maven-repo.

Du ska skapa två javaee-projekt (t.ex. med min javaee-archetype, se github) - ett projekt "sportsing-webservice" och ett "sportsing-frontend".
Båda projekten behöver denna dependency i pom.xml:
```
	<dependency>
		<groupId>com.sportsing</groupId>
		<artifactId>api-classes</artifactId>
		<version>1.0</version>
	</dependency>
```
Kom ihåg att köra "Maven Update" (högerklick-menyn) efter du lagt till dependencyn.

Bygg en webservice som returnerar en `List<Match>` med godtyckligt (hårdkodat eller slumpat) innehåll. Kolla på GrossistApplication och ArticleRSService i grossist-projektet.


Bygg sedan en till webapplikation som gör anrop mot sportsing-webservicen och visar på en websida. JSF + CDI-backing bean (som använder en JAX-RS-klient för att prata med webservicen, jämför updateIngredientCosts() i jpakonditori BakeryBean).

