name := "play-with-skinny-orm"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.skinny-framework" %% "skinny-orm"              % "0.9.19",
  "org.scalikejdbc"      %% "scalikejdbc-play-plugin" % "1.7.1",
  "com.h2database"       %  "h2"                      % "1.3.174"
)     


play.Project.playScalaSettings
