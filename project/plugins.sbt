addSbtPlugin("com.eed3si9n" % "sbt-doge"      % "0.1.5")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.6.1")
resolvers += Resolver.bintrayIvyRepo("scalameta", "sbt-plugins") // only needed for scalatex 0.3.8-pre
addSbtPlugin("com.lihaoyi"     % "scalatex-sbt-plugin" % "0.3.8-pre")
addSbtPlugin("io.get-coursier" % "sbt-coursier"        % "1.0.0-M15")
addSbtPlugin("com.jsuereth"    % "sbt-pgp"             % "1.0.0")
addSbtPlugin("org.xerial.sbt"  % "sbt-sonatype"        % "1.1")
addSbtPlugin("me.lessis"       % "bintray-sbt"         % "0.3.0")
addSbtPlugin("com.dwijnand"    % "sbt-dynver"          % "1.2.0")
addSbtPlugin("ch.epfl.lamp"    % "sbt-dotty"           % "0.1.1")
addSbtPlugin("org.scalameta"   % "sbt-scalahost"       % Dependencies.scalametaV)

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
