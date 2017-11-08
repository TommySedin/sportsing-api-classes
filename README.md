# sportsing-api-classes

Klona ner detta repo och kör "mvn install" i katalogen för att peta in i ditt lokala maven-repo.

Skapa ett webservice-projekt (t.ex. med min javaee-archetype)
Lägg till en dependency i det projektets pom.xml:
	<dependency>
		<groupId>com.sportsing</groupId>
		<artifactId>api-classes</artifactId>
		<version>1.0</version>
	</dependency>

Bygg en webservice som returnerar en List<Match> med godtyckligt (hårdkodat eller slumpat) innehåll. Kolla på GrossistApplication och ArticleListService i grossist-projektet.


Bygg sedan en till webapplikation som gör anrop mot sportsing-webservicen och visar på en websida. JSF + CDI-backing bean (som använder en JAX-RS-klient för att prata med webservicen, jämför updateIngredientCosts() i jpakonditori BakeryBean).

