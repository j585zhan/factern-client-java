#!/usr/bin/env bash

mvn veryify -P sign-artifacts --settings settings.xml

if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    mvn deploy -P sign-artifacts --settings settings.xml
fi