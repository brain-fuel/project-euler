# project_euler
Code and explanations for Project Euler problems

<img src="https://github.com/polyfy/polylith/blob/master/images/logo.png" width="30%" alt="Polylith" id="logo">

The Polylith documentation can be found here:

- The [high-level documentation](https://polylith.gitbook.io/polylith)
- The [Polylith Tool documentation](https://github.com/polyfy/polylith)
- The [RealWorld example app documentation](https://github.com/furkan3ayraktar/clojure-polylith-realworld-example-app)

You can also get in touch with the Polylith Team on [Slack](https://clojurians.slack.com/archives/C013B7MQHJQ).

# project_euler

FIXME: my new application.

## Installation

Download from https://github.com/brain-fuel/project_euler

## Usage

FIXME: explanation

Get info about the workspace:

    $ clojure -M:poly info

In addition to the `development` project which you will use with a REPL
for developing against the whole workspace, there are two projects:

* `project_euler` -- a command-line application, aliased as `app`
* `project_euler-lib` -- a simple library, aliased as `lib`

Run all the workspace's tests, including the development tests:

    $ clojure -M:poly test :all :dev

This runs all of the tests in the workspace, including the example
generative test in the project_euler `app` project.

> Normally, you would run just tests for components that have changed: `clojure -M:poly test` (optionally with `:project` to all run project-specific tests).

To develop against this workspace, start a REPL in your favorite way, using the `:dev` and `:test` aliases.

Build a deployable artifact for the project_euler command-line application project:

    $ ( cd projects/project_euler && clojure -X:uberjar )

Run that uberjar:

    $ java -jar projects/project_euler/project_euler.jar
    Hello, World!
    $ java -jar projects/project_euler/project_euler.jar Lisa
    Hello, Lisa!

Build a deployable library artifact for the project_euler-lib project:

    $ ( cd projects/project_euler-lib && clojure -X:jar )

This will update the generated `pom.xml` file to keep the dependencies synchronized with
that project's `deps.edn` file. You can update the version (and SCM tag) information in the `pom.xml` using the
`:version` argument:

    $ ( cd projects/project_euler-lib && clojure -X:jar :version '"1.2.3"' )

It will have the coordinates `net.clojars.brain-fuel/project_euler` (and a version of `"0.1.0-SNAPSHOT"` initially).

You can install that JAR file locally:

    $ ( cd projects/project_euler-lib && clojure -X:install )

You can also deploy that JAR file to Clojars:

    $ ( cd projects/project_euler-lib && clojure -X:deploy )

You can then depend on the library in other projects (adjust the `:mvn/version` as necessary):

    $ clj -Sdeps '{:deps { net.clojars.brain-fuel/project_euler {:mvn/version "0.1.0-SNAPSHOT"}}}'
    Clojure 1.10.3
    user=> (require '[brain-fuel.project-euler.greeter.interface :as greet])
    nil
    user=> (greet/greeting {:person "REPL"})
    "Hello, REPL!"


## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections
### That You Think
### Might be Useful

## License

	Project Euler: Clojure Solutions to Project Euler Problems
    Copyright © 2021 Matt Laine

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
