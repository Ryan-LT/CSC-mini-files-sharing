var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .otherwise(
            { redirectTo: '/'}
        );
});

