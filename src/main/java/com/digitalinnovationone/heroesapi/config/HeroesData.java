package com.digitalinnovationone.heroesapi.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;

import static com.digitalinnovationone.heroesapi.constans.HeroesContant.REGION_DYNAMO;
import static com.digitalinnovationone.heroesapi.constans.HeroesContant.ENDPOINT_DYNAMO;


public class HeroesData {
    public static void main (String[] args){
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
                .build();
        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("Heroes");

        Item hero = new Item()
                .withPrimaryKey("id", "3")
                .withString("name", "Xmen")
                .withString("universe", "marvel")
                .withNumber("films", 3)
                .withString("genero", "Ação")
                .withString("Autor", "Bryan Singer")
                .withNumber("ano_lancamento", 2012);

        Item hero2 = new Item()
                .withPrimaryKey("id", "4")
                .withString("name", "Deadpool")
                .withString("universe", "dc")
                .withNumber("films", 2)
                .withString("genero", "Aventura")
                .withString("Autor", "Bob Yaun")
                .withNumber("ano_lancamento", 2015);

        Item hero3 = new Item()
                .withPrimaryKey("id", "5")
                .withString("name", "Geovane")
                .withString("universe", "dc")
                .withNumber("films", 2)
                .withString("genero", "Aventura")
                .withString("Autor", "Dylan Singer")
                .withNumber("ano_lancamento", 2010);

        PutItemOutcome outcome1 = table.putItem(hero);
        PutItemOutcome outcome2 = table.putItem(hero2);

    }
}
