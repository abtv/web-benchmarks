## 1. Description

There are following simplest web servers written in:

* Clojure
* Go
* Rust

The idea is to compare performance of these web servers.

## 2. Disclaimer

This is the simplest possible benchmark. All the results will be different in real applications. This is just a starting point if you want to play with these languages and measure performance.

## 3. Prerequisites

You need to install the following software:

* Clojure: JDK 1.8 and Leiningen (http://leiningen.org)
* Go (https://golang.org/dl)
* Rust (https://www.rust-lang.org/downloads.html)

## 4. Building web servers

Clojure:

* Build: `lein do clean, uberjar`
* Run: `java -jar target/cljweb.jar`


Go:

* Build: `go build go_web.go`
* Run: `./go_web`


Rust:

* Build: `cargo build --release`
* Run: `target/release/rust_web`

## 5. Running the benchmarks

I use https://github.com/wg/wrk to perform benchmarks. You can clone and build wrk with `make`.

Then you can run `./wrk -t12 -c400 -d30s http://localhost:3000`


## License

Copyright © 2016 Andrey Butov

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
