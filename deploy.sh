#!/usr/bin/env bash

mvn verify -P sign-artifacts --settings settings.xml

if [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ]; then
    mvn deploy -P sign-artifacts --settings settings.xml
fi