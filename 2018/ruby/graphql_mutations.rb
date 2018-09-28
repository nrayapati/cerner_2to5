# The graphql-client is a really good library to consume Graphql APIs in Ruby.
# https://github.com/github/graphql-client
# You can execute a mutation the same way as if it was a regular query passing the variables you want to use:
# cerner_2^5_2018

require 'graphql/client'
require 'graphql/client/http'

module Api
  HTTP = GraphQL::Client::HTTP.new(ENV['GRAPHQL_API_URL'])
  Schema = GraphQL::Client.load_schema(HTTP)
  Client = GraphQL::Client.new(schema: Schema, execute: HTTP)
end

CreateCityMutation = Api::Client.parse(<<~'GRAPHQL')   
  mutation($name: String) {
    createCity(name: $name) {
      id
    }
  }
GRAPHQL

variables = {name: 'Jacksonville'}
result = Api::Client.query(CreateCityMutation, variables: variables)
puts result.data.create_city.id