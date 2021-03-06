# coding: utf-8
lib = File.expand_path('../lib', __FILE__)
$LOAD_PATH.unshift(lib) unless $LOAD_PATH.include?(lib)
require 'asciidoctor/pdf/cjk/version'

Gem::Specification.new do |spec|
  spec.name          = "asciidoctor-pdf-cjk"
  spec.version       = Asciidoctor::Pdf::Cjk::VERSION
  spec.authors       = ["Rei"]
  spec.email         = ["chloerei@gmail.com"]

  spec.summary       = %q{asciidoctor-pdf CJK extension}
  spec.description   = %q{asciidoctor-pdf CJK extension}
  spec.homepage      = ""

  spec.files         = `git ls-files -z`.split("\x0").reject { |f| f.match(%r{^(test|spec|features)/}) }
  spec.bindir        = "exe"
  spec.executables   = spec.files.grep(%r{^exe/}) { |f| File.basename(f) }
  spec.require_paths = ["lib"]

  spec.add_dependency "asciidoctor-pdf", "~> 1.5.0.alpha.8"
  spec.add_development_dependency "bundler", "~> 1.10"
  spec.add_development_dependency "rake", "~> 10.0"
  spec.add_development_dependency "minitest"
end
