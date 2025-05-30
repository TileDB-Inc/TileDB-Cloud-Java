# Regenerate client:

Install desired version of `openapi-generator-cli` ([docs](https://openapi-generator.tech/docs/installation)):
```bash
npm install @openapitools/openapi-generator-cli -g
openapi-generator-cli version-manager set 7.7.0
openapi-generator generate -i openapi-v1.yaml -g java
```

Update local copy of spec from [`TileDB-Server//openapi/v4/build/spec/openapi.yaml`](https://github.com/TileDB-Inc/TileDB-Server/blob/main/openapi/v4/build/spec/openapi.yaml):
```bash
gh api -H "Accept: application/vnd.github.raw" \
    /repos/TileDB-Inc/TileDB-Server/contents/openapi/v4/build/spec/openapi.yaml \
  > openapi-v4.yaml
```

Regenerate client ([`regen.sh`](regen.sh)):
```bash
./regen.sh
```

This regenerates the client code, `git add`s relevant files, and applies custom code / patches (see [`patch`]).

[`patch`]: https://github.com/TileDB-Inc/TileDB-Cloud-Java/commit/patch
