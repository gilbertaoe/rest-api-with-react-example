import { Component } from 'react';
import { Text, View, Image, StyleSheet } from 'react-native';

export class Card extends Component {
    render() {
        return (
            <View>
                <Text>{this.props.title}</Text>
            </View>
        );
    }
}

const styles = StyleSheet.create({
    container: {
        paddingTop: 50,
    },
    stretch: {
        width: 50,
        height: 10,
        resizeMode: 'stretch',
    },
});