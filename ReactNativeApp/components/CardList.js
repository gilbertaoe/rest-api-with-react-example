import { Component } from 'react';
import { StatusBar } from 'expo-status-bar';
import { View, FlatList, StyleSheet, Image, Text } from 'react-native';

const cardData = () => {
    return fetch('http://localhost:8082/api/flowers')
      .then(response => response.json())
      .then((responseJson) => {
        this.setState({
          isLoading: false,
          data: responseJson
        })
      })
      .catch(error => {
        console.error(error);
      });
  };

const DATA = [
    {
        id: 'bd7acbea-c1b1-46c2-aed5-3ad53abb28ba',
        title: 'First Item',
        image: require('./../assets/flowers/white_water_lily.jpg'),
        description: 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.'
    },
    {
        id: '3ac68afc-c605-48d3-a4f8-fbd91aa97f63',
        title: 'Second Item',
        image: require('./../assets/flowers/common_columbine.jpg'),
        description: 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.'
    },
    {
        id: '58694a0f-3da1-471f-bd96-145571e29d72',
        title: 'Third Item',
        image: require('./../assets/flowers/white_water_lily.jpg'),
        description: 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.'
    },
];

export class CardList extends Component {
    render() {
        return (
            <View>
                <FlatList data={cardData} renderItem={({ item }) => <Card title={item.Name} image={item.ImagePath} description={item.Description} />} keyExtractor={item => item.Name} />
            </View>
        );
    }
}

const Card = ({ title, image, description }) => (
    <View style={styles.card}>
        <Image style={styles.image} source={image} />
        <View>
            <Text style={styles.title}>{title}</Text>
            <Text style={styles.description}>{description}</Text>
        </View>
    </View>
);

const styles = StyleSheet.create({
    image: {
        width: '100%',
        height: 150,
        marginRight: 15,
    },
    card: {
        flex: 1,
        flexWrap: 'wrap',
        marginVertical: 15,
    },
    container: {
        flex: 1,
        marginTop: StatusBar.currentHeight || 0,
    },
    item: {
        backgroundColor: '#f9c2ff',
        padding: 20,
        marginVertical: 8,
        marginHorizontal: 16,
    },
    title: {
        fontSize: 32,
    },
    description: {
        fontSize: 16,
    },
});